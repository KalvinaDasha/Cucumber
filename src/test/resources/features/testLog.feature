#language:ru
#encoding:UTF-8

@myTest

  Функционал: проверка запуска теста
    Сценарий: Проверка логина и пароля
      Допустим открыта стартовая страница сайта "https://www.saucedemo.com/"
      И пользователь вводит логин "standard_user"
      И пользователь вводит пароль "secret_sauce"
      И пользователь нажимает кнопку LOGIN
      Тогда  открыта страница "https://www.saucedemo.com/inventory.html"


