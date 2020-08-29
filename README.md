## Образец CRUD-приложения. Java, spring, thymeleaf, MySQL.
Возможность читать, добавлять, редактировать и удалять записи. 
Структура БД: restaurants(id, city, name)

##### Приложение стартует на http://localhost:8050/

Настройка application.properties:

    "springcruddemo" в строке 
        spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/springcruddemo?useUnicode=true&serverTimezone=UTC&useSSL=false
		
	логин в spring.datasource.username=root
	
	пароль в spring.datasource.password=admin
	
##### 1. GET localhost:8050/restaurants
    Возвращает все текущие записи в формате HTML

##### 2. GET localhost:8050/restaurant-create
    Перенаправляет на страницу создания записи
    
##### 3. POST localhost:8050/restaurant-create
    Сохраняет отправленную новую запись
    Перенаправляет на начальную страницу localhost:8050/restaurants
    
##### 4. POST localhost:8050/restaurant-delete/{id}
    Удаляет запись из базы данных по id
    Перенаправляет на начальную страницу localhost:8050/restaurants
    
##### 5. GET localhost:8050/restaurant-update/{id}
    Перенаправляет на страницу обновления записей localhost:8050/restaurant-update
    
##### 6. POST localhost:8050/restaurant-update/{id}
    Сохраняет(обновляет) запись из базы данных по id
    Перенаправляет на начальную страницу localhost:8050/restaurants
---

####Все запросы генерируются автоматически из форм HTML-страниц.


#### Сборка проекта - скрипт build.sh  запуск  start.sh

