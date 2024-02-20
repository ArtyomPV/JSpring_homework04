<h1>Фреймворк Spring (семинары)</h1>
<h2>Урок 5. Spring Data для работы с базами данных</h2>
Базовое задание:<br>
Условие:<br>
Вам предстоит создать приложение для управления списком задач с использованием Spring Boot и Spring Data JPA. Требуется реализовать следующие функции:
<ul>
<li>Добавление задачи. Подсказка метод в контроллере: 

```java
@PostMapping public Task addTask(@RequestBody Task task)
```
<li>Просмотр всех задач. Подсказка метод в контроллере: 

```java
@GetMapping public List<Task> getAllTasks()
```
<li>Просмотр задач по статусу (например, "завершена", "в процессе", "не начата"). Подсказка метод в контроллере: 

```java
@GetMapping("/status/{status}") public List<Task> getTasksByStatus(@PathVariable TaskStatus status)
```
<li>Изменение статуса задачи. Подсказка метод в контроллере: 

```java
@PutMapping("/{id}") public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task task)
```

<li>Удаление задачи. Подсказка метод в контроллере:

```java
@DeleteMapping("/{id}")
public void deleteTask(@PathVariable Long id)
```
</ul>

Репозитроий подсказка 

```java
public interface TaskRepository extends JpaRepository<Task, Long>
```


Структура задачи(класс Task):
- ID (автоинкрементное)(тип Long)
- Описание (не может быть пустым)(тип String)
- Статус (одно из значений: "не начата", "в процессе", "завершена")(Тип TaskStatus )
- Дата создания (автоматически устанавливается при создании задачи)(Тип LocalDateTime)

Подсказка понадобится энумератор:
enum TaskStatus {
NOT_STARTED, IN_PROGRESS, COMPLETED;
}

Задание со звездочкой:
Приложен к материалам семинара файл StrongHomeTask.txt