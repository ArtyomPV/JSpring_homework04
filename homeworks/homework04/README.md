<h1>Фреймворк Spring (семинары)</h1>
<h2>Урок 4. Spring MVC. Использование шаблонизатора Thymeleaf</h2>
<p>Базовое задание:<p>
<ol>
<li>Создание базового веб-приложения Spring MVC 
<p>Начните с создания простого веб-приложения с использованием Spring MVC. Это может быть простой сайт, который выводит "Привет, мир!" на главной странице. Используйте аннотацию @Controller и @RequestMapping для маршрутизации запросов на эту страницу.
</p></li>
<li>Добавление Thymeleaf в проект
<p>Добавьте Thymeleaf в свое веб-приложение Spring MVC. Создайте простую страницу с некоторыми переменными, которые заполняются с помощью модели Spring MVC и отображаются на странице с использованием Thymeleaf.
</p></li>
<li>Создание формы ввода и обработка данных формы
<p>Создайте страницу с формой ввода, используя Thymeleaf для рендеринга формы. Затем создайте контроллер Spring MVC, который обрабатывает отправку формы и выводит полученные данные. Это может быть форма для регистрации или любая другая форма, которая собирает информацию от пользователя.
</p></li>
</ol>
<!-- </p> -->
<p>
Все необходимые примеры кода для этого задания мы разбирали на семинаре.
</p>
<h2>Задание со звездочкой:</h2>
<p>Проект домашнего задания для 2 семинара (CRUD приложение USER SERVICE) переписать:</p>
<ol>
<li>Использовать библиотеку Lomboc:
    <ul>
        <li>a) @Data - для полей классов</li>
        <li>b) @AllArgsConstructor - для классов с конструкторами</li>
        <li>c) @Log - логировать работу всех контроллеров</li>
    </ul>
</li>
<li>Использовать configuration-processor для работы с настройками приложения:
    <ul>
        <li>a) Создать объект инкапсулирующий шаблоны запросов к базе данных H2</li>
        <li>b) Использовать аннотации @ConfigurationProperties и @ConfigurationPropertiesScan для заполнения полей этого класса</li>
        <li>с) Вынести все SQL шаблоны в настройки приложения.</li>
    </ul>
</li>
</ol>