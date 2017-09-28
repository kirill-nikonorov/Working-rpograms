<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>Index Page</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../../resources/css.css" type="text/css">
</head>

<body>
<header class="page-header">Форма личных данных</header>
<main>
    <form action="/check-user" method="post">
        <fieldset>
            <legend style="color:red;">Регистрация</legend>
            <label for="name">Имя</label>
            <input type="text" id="name" name="name" pattern="[а-яa-z]*"
                   placeholder="Имя латиницей">
            <label for="password">Пароль</label>
            <input type="password" id="password" name="password"
            >
            <div class="half-width">
                <label for="email">Email</label>
                <input type="email" id="email" name="email">
            </div>
            <div class="half-width">
                <label for="url">Личный сайт</label>
                <input type="text" id="url" name="url">
            </div>
            <div class="one-third-width">
                <label for="color">Окрас</label>
                <input type="color" id="color" name="color">
            </div>
            <div class="two-third-width">
                <label for="food">Любимая еда</label>
                <select id="food" name="food" size="3" multiple>
                    <optgroup label="Вкуснятина">
                        <option value="meat">Мясо</option>
                        <option value="fish">Рыба</option>
                        <option value="chi">Курочка</option>
                        <option value="ind">Индейка</option>
                        <option value="mice">Мыши</option>
                    </optgroup>
                    <optgroup label="Сойдёт">
                        <option value="milk">Молоко</option>
                        <option value="kef">Кефир</option>
                        <option value="water">Вода</option>
                        <option value="smet">Сметана</option>
                    </optgroup>
                </select>
            </div>
        </fieldset>
        <div class="buttons">
            <input type="submit" value="Оформить">
        </div>
    </form>
</main>
<footer class="page-footer"></footer>
</body>

</html>

</html>