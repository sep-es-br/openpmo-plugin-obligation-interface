# openpmo-plugin-obligation-interface

Contrato compartilhado para integrações do OpenPMO com fontes externas de Empenhos.

## Objetivo

Este projeto define uma API neutra para listar anos, unidades gestoras, Empenhos e seus detalhes. A aplicação depende somente do contrato, enquanto um plugin separado acessa e interpreta a fonte de dados.

Não fazem parte deste projeto chamadas HTTP, autenticação, parser de respostas, persistência ou regras do banco de dados do OpenPMO.

## Requisitos

- Java 11 ou superior;
- JitPack configurado no projeto consumidor.

## Instalação

```groovy
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.sep-es-br:openpmo-plugin-obligation-interface:1.0.0'
}
```

## Contrato do provider

```java
public interface IObligationProvider {

    List<Long> getYears();

    List<ObligationManagementUnitDto> getManagementUnits(Long year);

    List<ObligationDto> getObligations(
        Long year,
        ObligationManagementUnitDto managementUnit
    );

    ObligationDto getObligation(
        String processId,
        String managementUnitCode
    );
}
```

| Método | Finalidade |
| --- | --- |
| `getYears()` | Lista os anos com Empenhos disponíveis. |
| `getManagementUnits(year)` | Lista as unidades gestoras disponíveis no ano. |
| `getObligations(year, managementUnit)` | Lista os Empenhos da unidade selecionada. |
| `getObligation(processId, managementUnitCode)` | Obtém os detalhes de um Empenho. |

## DTOs

### `ObligationManagementUnitDto`

| Campo | Descrição |
| --- | --- |
| `code` | Código da unidade gestora. |
| `name` | Nome da unidade gestora. |

### `ObligationDto`

| Campo | Tipo | Descrição |
| --- | --- | --- |
| `processId` | `String` | Identificador do Empenho na fonte externa. |
| `processNumber` | `String` | Número do processo ou documento. |
| `managementUnitCode` | `String` | Código da unidade gestora. |
| `managementUnitName` | `String` | Nome da unidade gestora. |
| `year` | `Long` | Ano do Empenho. |
| `description` | `String` | Descrição do Empenho. |
| `supplierCnpj` | `String` | CNPJ do fornecedor. |
| `amount` | `String` | Valor conforme fornecido pela integração. |
| `protocol` | `String` | Protocolo relacionado. |

## Criando uma implementação

```java
@Component
public class ExampleObligationProvider implements IObligationProvider {
    // Implementar as quatro operações do contrato.
}
```

Quando o consumidor utiliza descoberta por Spring, a implementação deve ser registrada como bean. O contrato não depende do Spring.

## Build local

```powershell
.\gradlew.bat clean build
```

```bash
./gradlew clean build
```
