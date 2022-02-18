•	Язык программирования: Java 8;
•	Frameworks: Spring Boot Starter, Spring Web, Spring JPA, Spring Hibernate;
•	База данных: Postgres SQL;
•	Библиотека для генерации документации: springdoc-openapi v1.5.9

Перед началом подключитесь к базе данных, в файле application.yaml замените значения на ваши.

Запустите java приложение

Перейдите в swagger ui:
http://localhost:8080/swagger-ui.html

Используйте методы для тестирования. К сожалению, были реализованы далеко не все методы и не все виды проверок
в связи с ограниченным количеством времени, однако базовые были реализованы все.

Ниже привидены json-ы для ускорения их создания и проверки работоспособности методов.
Указанные в самом сваггере examples of json body, дают полный json объекта, но он не всегда подойдет для проверки, 
в тоже время приведенные мною ниже - подойдут. (после двоеточия меняем на свое)

Формат json для всех сущностей Equipment (PCEquipment, TVEquipment, ...): операции добавления и обновления

{
    "typeName": "string",
    "manufacturerCountry": "string",
    "firm": "string",
    "hasOnline": true,
    "hasInstallmentPlan": true
 }

Формат json для PCModel (id в pcEquipmet должен существовать, чтобы сслыться на него): добавление

{
  "modelName": "string",
  "serialNumber": 0,
  "color": "string",
  "modelSize": 0,
  "price": 0,
  "category": "string",
  "processorType": "string",
  "pcEquipment": {
    "id": 0
  },
  "available": true
}

Формат json для RefrigeratorModel (id в refrigeratorEquipmet должен существовать, чтобы сслыться на него): добавление

{
  "modelName": "string",
  "serialNumber": 0,
  "color": "string",
  "modelSize": 0,
  "price": 0,
  "numberOfDoors": 0,
  "compressorType": "string",
  "refrigeratorEquipment": {
    "id": 0
  },
  "available": true
}

Формат json для SmartphoneModel (id в SmartphoneEquipmet должен существовать, чтобы сслыться на него): добавление

{
  "modelName": "string",
  "serialNumber": 0,
  "color": "string",
  "modelSize": 0,
  "price": 0,
  "memoryGB": 0,
  "countOfCamera": 0,
  "smartphoneEquipment": {
    "id": 0
  },
  "available": true
}

Формат json для VacuumCleanerModel (id в VacuumCleanerEquipmet должен существовать, чтобы сслыться на него): добавление

{
  "modelName": "string",
  "serialNumber": 0,
  "color": "string",
  "modelSize": 0,
  "price": 0,
  "volume": 0,
  "numberOfModes": 0,
  "vacuumCleanerEquipment": {
    "id": 0
  },
  "available": true
}

Формат json для TVModel (id в TVEquipmet должен существовать, чтобы сслыться на него): добавление

{
    "modelName": "string",
    "serialNumber": 0,
    "color": "string",
    "modelSize": 0,
    "price": 0,
    "category": "string",
    "technology": "string",
    "tvequipment": {
      "id": 0
    },
    "available": true
  }
  
  
Формат json для PCModel (id в pcEquipmet должен существовать, чтобы сслыться на него): обновление

{
  "modelName": "string",
  "serialNumber": 0,
  "color": "string",
  "modelSize": 0,
  "price": 0,
  "category": "string",
  "processorType": "string",
  "available": true
}


Формат json для RefrigeratorModel (id в refrigeratorEquipmet должен существовать, чтобы сслыться на него): обновление

{
  "modelName": "string",
  "serialNumber": 0,
  "color": "string",
  "modelSize": 0,
  "price": 0,
  "numberOfDoors": 0,
  "compressorType": "string",
  "available": true
}

Формат json для SmartphoneModel (id в SmartphoneEquipmet должен существовать, чтобы сслыться на него): обновление

{
  "modelName": "string",
  "serialNumber": 0,
  "color": "string",
  "modelSize": 0,
  "price": 0,
  "memoryGB": 0,
  "countOfCamera": 0,
  "available": true
}

Формат json для VacuumCleanerModel (id в VacuumCleanerEquipmet должен существовать, чтобы сслыться на него): обновление

{
  "modelName": "string",
  "serialNumber": 0,
  "color": "string",
  "modelSize": 0,
  "price": 0,
  "volume": 0,
  "numberOfModes": 0,
  "available": true
}

Формат json для TVModel (id в TVEquipmet должен существовать, чтобы сслыться на него): обновление

{
    "modelName": "string",
    "serialNumber": 0,
    "color": "string",
    "modelSize": 0,
    "price": 0,
    "category": "string",
    "technology": "string",
    "available": true
  }
