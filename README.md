Курсовая по теме "Информационная система для организации мероприятий"
У меня будет простой вариант без использования react и java fx, просто сайт

Мне нужно, чтобы была кнопка об авторе, диаграмма, также нужно чуть изменить базу данных, чтобы поля соответствовали указанной теме

Ниже представлены основные требования:

1. Проект представляет собой разработку информационной системы, посвященной заданной предметной области (теме). Ключевые требования к стеку технологий и функциональным возможностям:
1.1. Доступный стек технологий для реализации системы: Java; языки запросов; ORM; JPA; Hibernate; RESTful API. БД: MySQL/PostgreSQL. Необходимо реализовать ЛИБО веб-приложение с веб-интерфейсом, ЛИБО графическое приложение. Если выбрано графическое приложение, его реализация возможна только с использованием JavaFX. Графический интерфейс должен быть интуитивно понятным и обеспечивать доступ ко всем функциям системы. Выбор формата приложения (веб или графическое) остается за руководителем курсовой работы, а также зависит от поставленных задач и целей курсовой работы. Реализация мобильного приложения не допускается, так как это не входит в компетенцию дисциплины «Современные технологии программирования».
1.2. Регистрация и авторизация. Доступ к функциям системы должен быть возможен только после успешной авторизации пользователя. Неавторизованным пользователям функции системы недоступны.
1.3. Отображение данных предметной области в таблице. Информация из базы данных должна быть представлена в удобной табличной форме с возможностью просмотра всех записей.
1.4. Реализовать добавление в БД нового объекта, удаление объекта, редактирование объекта. Пользователь должен иметь возможность вводить данные для создания нового объекта. Пользователь должен иметь возможность удалить объект из базы данных. Пользователь должен иметь возможность изменить данные существующего объекта.
1.5. Поиск и вывод записей. Предусмотреть возможность поиска по всем записям в зависимости от специфики предметной области. Результаты поиска должны отображаться в упрощенном и понятном виде.
1.6. Реализовать сортировку записей. Реализовать сортировку записей по различным критериям (например, по алфавиту, дате, числовым значениям), в зависимости от типа данных и специфики предметной области.
1.7.  Разделение ролей пользователей. Для каждой роли – свои интерфейс и функциональные возможности. Однако, если это возможно, рекомендуется реализовать единый интерфейс с разграничением доступа и функциональных возможностей в зависимости от роли пользователя. Например, если у нас информационная система больницы, то роли будут следующими: пациент, сотрудник регистратуры, врач и администратор. Тогда:
1.7.1. У пациента должны быть реализованы следующие возможности: просмотр и заполнение личной информации (например, паспортные данные, страховой полис); запись на прием к врачу; просмотр расписания приема врачей; ознакомление с результатами анализов и медицинскими заключениями от врачей.
1.7.2. У сотрудника регистратуры должны быть реализованы следующие возможности: управление расписанием врачей (создание, изменение, удаление записей); регистрация пациентов в системе; запись пациентов на прием к врачам; просмотр общей базы пациентов с возможностью поиска (фильтрации) по имени, дате рождения и другим параметрам.
1.7.3. У врача должны быть реализованы следующие возможности: доступ к записям пациентов, записанных на прием; ведение медицинской карты пациента (добавление диагнозов, рекомендаций, результатов анализов); назначение анализов и обследований; просмотр истории лечения пациента.
1.7.4. У администратора должен быть интерфейс с изменением ролей пользователей, который доступен только ему.
Такой подход легко адаптируется для различных предметных областей (тем курсовой работы). Допустимо использовать одну роль в зависимости от предметной области и по согласованию с руководителем курсовой работы.
1.8. Статистические функции: общее количество пользователей системы; среднее время ожидания чего-либо (например, приема пациента). Допускается реализация гистограммы/диаграммы для вывода статистической информации.
1.9. Пункт меню «Об авторе» на отдельной странице. Пункт «Об авторе» должен быть представлен в виде отдельной страницы, доступной через главное меню системы. Информация должна включать: ФИО автора; группу/учебное заведение; контактные данные; краткое описание опыта работы с технологиями, использованными в проекте; даты начала и завершения работ над проектом.
1.10. Приложение должно быть устойчивым к нештатным ситуациям и исключать аварийное завершение. При некорректном вводе данных, использовании недопустимых или противоречивых значений, отсутствии данных по запросу пользователя, а также при других ошибках, необходимо отображать информативные сообщения. Сообщения должны быть представлены в виде всплывающих окон, уведомлений или отдельных страниц (например, при ошибке 404). Эти уведомления должны содержать понятное описание проблемы и, при необходимости, рекомендации для её устранения.

2. Пояснительная записка (ПЗ) представляет собой документ, сопровождающий проект, в котором описываются цели, задачи, структура и результаты разработки. 
2.1. Структура: 
- титульный лист; 
- оглавление; 
- введение, включающее определение предметной области (темы курсовой работы); 
- определение объекта и предмета исследования; 
- постановка задачи;
- описание программы: алгоритмические решения (безопасность, описание клиента и сервера); описание интерфейса программы; архитектура приложения;
- структура реализованных классов и их назначение в рамках проекта;
- заключение;
- список литературы;
- приложения (исходный код программы).
2.2. Объем пояснительной записки: 30–49 страниц с учетом приложений.
2.3. Антиплагиат: оригинальность ПЗ должна быть не менее 80%.
![image](https://github.com/user-attachments/assets/949d5e58-c743-48f0-a09f-880ad04b961f)