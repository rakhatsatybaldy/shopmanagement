## API for management shop

### API actions
 - [GET /rest/api/getAllGoods](#get-restapigetallgoods)
 - [PUT /rest/api/updateGood/{id}](#put-restapiupdategoodid)
 - [DELETE /rest/api/deleteGood/{id}](#delete-restapideletegoodid)
 - [PUT /rest/api/updateUserBalance/{id}](#put-restapiupdateuserbalanceid)
 - [PUT /rest/api/blockUser/{id}](#put-restapiblockuserid)
 - [GET /rest/api/getOneGood/{id}](#get-restapigetonegoodid)
 - [POST /rest/api/addGood}](#post-restapiaddgood)
 - [POST /rest/api/addCategory](#post-restapiaddcategory)
 - [GET /rest/api/getAllUsers](#get-restapigetallusers)


### GET /rest/api/getAllGoods

Getting all goods which my shop has. Returns all goods from shop.

#### Sample request

````
GET /rest/api/getAllGoods
````

#### Sample response

````
200 OK

[
    {
        "id": 5,
        "name": "Смартфон Apple iPhone 12 Pro 128GB Blue",
        "description": "Диагональ дисплея, дюйм : 6.1 , Разрешение дисплея : 2532x1170 , Операционная система : iOS 14 , Объем оперативной памяти : 6 , Объём встроенной памяти : 128 , Количество SIM-карт : 1 , Модельный год : 2020",
        "price": 619990.0,
        "amount": 13,
        "categories": [
            {
                "id": 2,
                "name": "Смартфоны и гаджеты"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/2/c/2c26620bba089982a8a4b024c08042f90d5f8923_228626_1.jpg"
    },
    {
        "id": 1,
        "name": "Ноутбук Lenovo IdeaPad 3 Athlon Silver 3050U / 4ГБ / 256SSD / 15.6 / Win10 / (81W100V3RK)",
        "description": "Диагональ дисплея, дюйм : 15.6 , Серия процессора : Athlon Silver , Модель процессора : 3050U , Объём оперативной памяти, ГБ : 4 , Объём SSD накопителя ,ГБ : 256 , Операционная система :Windows 10",
        "price": 174990.0,
        "amount": 0,
        "categories": [
            {
                "id": 1,
                "name": "Ноутбуки и компьютеры"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/2/a/2a1ede9d14f99b063353de123f2fd80d115cd4cb_227564_1.jpg"
    },
    {
        "id": 7,
        "name": "Телевизор 32\" AVA 32W5 LED HD Android Black",
        "description": "Диагональ экрана, см ; 32\" (81 см) , Разрешение экрана : 1366x768 HD Ready , Поддержка технологии \"SMART TV\" : Да , Технология : LED , Тип экрана : Прямой , Формат крепления  : VESA100х100 мм",
        "price": 69990.0,
        "amount": 44,
        "categories": [
            {
                "id": 3,
                "name": "ТВ, аудио, фото, видео"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/6/6/66fc97e97a54542a415baf65572eef23abc8beb0_15859786711070.jpg"
    },
    {
        "id": 2,
        "name": "Ноутбук Lenovo IdeaPad 3 Athlon 3050U / 8ГБ / 1000HDD / 15.6 / Dos / (81W100XJRK)",
        "description": "Диагональ дисплея, дюйм : 15.6 , Модель процессора : 3050U , Объём оперативной памяти, ГБ : 8 , Объём HDD накопителя :  ГБ1000 , Операционная система : DOS",
        "price": 159990.0,
        "amount": 11,
        "categories": [
            {
                "id": 1,
                "name": "Ноутбуки и компьютеры"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/8/5/85f650f2a3e4496f62d839a4a59de3132a12978d_227228_1.jpg"
    },
    {
        "id": 4,
        "name": "Смартфон Samsung Galaxy A11 32GB Black ",
        "description": " Диагональ дисплея, дюйм : 6.4 , Разрешение дисплея : 720x1560 , Операционная система : Android 10.0 , Объем оперативной памяти : 2 , Объём встроенной памяти : 32 , Количество SIM-карт : 2 , Ёмкость аккумулятора, mAh:4000 , Модельный год : 2020",
        "price": 64890.0,
        "amount": 0,
        "categories": [
            {
                "id": 2,
                "name": "Смартфоны и гаджеты"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/4/7/47c6f1dcb09efc08c1b2d2450499f4d7589caeb9_219516_1.jpg"
    },
    {
        "id": 11,
        "name": "Игровая консоль XBOX One S 1TB + Джойстик XBOX с разъемом 3,5 мм и Bluetooth, Белый (234-00608)",
        "description": "Серия : X-Box One S , Оперативная память, ГБ : 8 , Объем встроенной памяти, ГБ : 1000 , Интерфейс : USB, Wi-Fi, Bluetooth, Ethernet, AUX, HDMI",
        "price": 144990.0,
        "amount": 11,
        "categories": [
            {
                "id": 4,
                "name": "Всё для геймеров"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/9/1/91bb6c6c44e2bac86fe2f62171c7048d7302770a_175749.jpg"
    },
    {
        "id": 8,
        "name": "Телевизор 43\" Samsung UE43T5300AUXCE LED FHD Smart Black",
        "description": "Диагональ экрана, см : 43\" (109 см) , Разрешение экрана : 1920x1080 Full HD , Поддержка технологии \"SMART TV\" : Да , Технология : LED , Тип экрана : Прямой , Поддержка HDR : Да",
        "price": 142790.0,
        "amount": 24,
        "categories": [
            {
                "id": 3,
                "name": "ТВ, аудио, фото, видео"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/d/0/d0ec11357dc976ffdb939b3bddb287cf0ced19f8_216516_2.jpg"
    },
    {
        "id": 9,
        "name": "Телевизор 43\" LG 43LM5700PLA LED FHD Smart Black",
        "description": "Диагональ экрана, см : 43\" (109 см) , Разрешение экрана : 1920x1080 Full HD , Поддержка технологии \"SMART TV\" : Да , Технология : LED , Тип экрана : Прямой , Поддержка HDR : Да",
        "price": 138590.0,
        "amount": 14,
        "categories": [
            {
                "id": 3,
                "name": "ТВ, аудио, фото, видео"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/7/5/75599dde41b1c2b6a2966f234bfe973dc9dfb991_190158_1.jpg"
    },
    {
        "id": 10,
        "name": "Игровая консоль XBOX One X 1TB Cyberpunk 2077 Limited Edition Bundle (FMP-00254)",
        "description": "Серия : X-Box One X , Оперативная память, ГБ : 12 , Объем встроенной памяти, ГБ : 1000 , Интерфейс : Ethernet, Wi-Fi, HDMI, AUX, Оптический аудиовыход, USB, Bluetooth",
        "price": 249990.0,
        "amount": 6,
        "categories": [
            {
                "id": 4,
                "name": "Всё для геймеров"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/f/9/f98a632de37c8ff7e25a69e77fa2108cfea81356_218967_1.jpg"
    },
    {
        "id": 12,
        "name": "Игровая консоль XBOX One S 1TB All Digital SOT, Minecraft, Fortnite (NJP-00060)",
        "description": "Серия : X-Box One S , Оперативная память, ГБ : 8 , Объем встроенной памяти, ГБ : 1000 , Интерфейс : USB, HDMI, Wi-Fi, AUX, Ethernet, Bluetooth",
        "price": 114990.0,
        "amount": 2,
        "categories": [
            {
                "id": 4,
                "name": "Всё для геймеров"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/1/7/17c87ef7fbed67fbc605042b1440c8428cd93838_200799_1vc.jpg"
    },
    {
        "id": 3,
        "name": "Ноутбук Asus X509JA i3 1005G1 / 8ГБ / 1000HDD / 15.6 / Win10 / (X509JA-BR237T)",
        "description": "Диагональ дисплея, дюйм : 15.6 , Серия процессора : Intel Core i3 , Модель процессора : 1005G1 , Объём оперативной памяти, ГБ:8 , Объём HDD накопителя, ГБ:1000 , Операционная система : Windows 10",
        "price": 219990.0,
        "amount": 3,
        "categories": [
            {
                "id": 1,
                "name": "Ноутбуки и компьютеры"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/f/6/f6b62d837183ce60fde6071d329c201e170975d0_224219_1.jpg"
    },
    {
        "id": 6,
        "name": "Смартфон OPPO A5 2020 64GB Mirror Black",
        "description": "Диагональ дисплея, дюйм : 6.5 , Разрешение дисплея : 720x1600 , Операционная система : Android 9.0 (Pie) , Объем оперативной памяти : 3 , Объём встроенной памяти : 64 , Количество SIM-карт : 2 , Ёмкость аккумулятора, mAh : 5000",
        "price": 89990.0,
        "amount": 23,
        "categories": [
            {
                "id": 2,
                "name": "Смартфоны и гаджеты"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/b/3/b3c56e5adba2aac68ddc44eda4efb71116aff626_179042_1.jpg"
    }
]
````



### PUT /rest/api/updateGood/{id}

Update all parametres of good that received with ID

#### Request body parametres
````
{
        "name": string?, // название товара
        "description": string?, // описание товара
        "price": double?, // цена товара
        "amount": int?, // количество товара
        "categories": [], // категория товара
        "urlOfPicture": string? // изображение товара
    }
````

#### Sample request

````
PUT /rest/api/updateGood/1

    {
        "id": 1,
        "name": "Ноутбук Lenovo IdeaPad 3 Athlon Silver 3050U / 4ГБ / 256SSD / 15.6 / Win10 / (81W100V3RK)",
        "description": "Диагональ дисплея, дюйм : 15.6 , Серия процессора : Athlon Silver , Модель процессора : 3050U , Объём оперативной памяти, ГБ : 4 , Объём SSD накопителя ,ГБ : 256 , Операционная система :Windows 10",
        "price": 174990.0,
        "amount": 12,
        "categories": [
            {
                "id": 1,
                "name": "Ноутбуки и компьютеры"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/2/a/2a1ede9d14f99b063353de123f2fd80d115cd4cb_227564_1.jpg"
    },
    {
        "id": 7,
        "name": "Телевизор 32\" AVA 32W5 LED HD Android Black",
        "description": "Диагональ экрана, см ; 32\" (81 см) , Разрешение экрана : 1366x768 HD Ready , Поддержка технологии \"SMART TV\" : Да , Технология : LED , Тип экрана : Прямой , Формат крепления  : VESA100х100 мм",
        "price": 69990.0,
        "amount": 44,
        "categories": [
            {
                "id": 3,
                "name": "ТВ, аудио, фото, видео"
            }
        ],
        "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/6/6/66fc97e97a54542a415baf65572eef23abc8beb0_15859786711070.jpg"
    }
````

#### Sample response

````
200 OK

{
    "id": 1,
    "name": "Ноутбук Lenovo IdeaPad 3 Athlon Silver 3050U / 4ГБ / 256SSD / 15.6 / Win10 / (81W100V3RK)",
    "description": "Диагональ дисплея, дюйм : 15.6 , Серия процессора : Athlon Silver , Модель процессора : 3050U , Объём оперативной памяти, ГБ : 4 , Объём SSD накопителя ,ГБ : 256 , Операционная система :Windows 10",
    "price": 174990.0,
    "amount": 12,
    "categories": [
        {
            "id": 1,
            "name": "Ноутбуки и компьютеры"
        }
    ],
    "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/2/a/2a1ede9d14f99b063353de123f2fd80d115cd4cb_227564_1.jpg"
}
````


### DELETE /rest/api/deleteGood/{id}

Delete good with specified `id`.


#### Sample request

````
PUT /rest/api/deletGood/1

````

#### Sample response

````
200 OK 

````


### PUT /rest/api/updateUserBalance/{id{

Update balance of user with specified `id`


#### Request body parametres

````

        "email": string?, // почта пользователя
        "password": string?, // пароль почты 
        "fullName": string?, // полное имя пользователя
        "address": string?, // адрес пользователя
        "city": []; // город пользователя
        "balance": double?, // баланс пользователя
        "blocked": boolean?, // блокирован ли пользователь
        "roles": [] // роли пользователя
````

#### Sample request 

````
PUT /rest/api/updateUserBalance/1
{
    "balance":1500000.0
}

````

#### Sample response

````
200 OK

{
    "id": 1,
    "email": "shinra_tensei@mail.ru",
    "password": "$2a$10$xvIO1uoq00oRLF2giBd5iOtKGmvkhubp2N6CPHBrH4xfDfjcc..K.",
    "fullName": "Yakhiko's Pain",
    "address": "мкр. Туран, ул. Новостройка, 410",
    "city": {
        "id": 1,
        "name": "Алматы"
    },
    "balance": 1500000.0,
    "blocked": false,
    "roles": [
        {
            "id": 1,
            "name": "ROLE_USER",
            "description": "DEFAULT ROLE FOR ALL USERS",
            "authority": "ROLE_USER"
        }
    ]
}
````


### PUT /rest/api/blockUser/{id}

Blocks or unblocks user with specified `id`
#### Sample request

````
PUT /rest/api/blockUser/2
{
    "blocked":"true"
}
````

#### Sample response

````
200 OK

{
    "id": 2,
    "email": "rahat_01_05@mail.ru",
    "password": "$2a$10$fs15UxMamFOzx8I3nhaj1OaYXgngBlym1koXek8B3dznqLa7uPkZO",
    "fullName": "Satybaldy Rakhat",
    "address": null,
    "city": {
        "id": 2,
        "name": "Шымкент"
    },
    "balance": 0.0,
    "blocked": false,
    "roles": [
        {
            "id": 1,
            "name": "ROLE_USER",
            "description": "DEFAULT ROLE FOR ALL USERS",
            "authority": "ROLE_USER"
        }
    ]
}
````


### GET /getOneGood/{id}

Return good with specified `id`
 


#### Sample request

````
GET /rest/api/getOneGood/1

````

#### Sample response

````
200 OK

{
    "id": 1,
    "name": "Ноутбук Lenovo IdeaPad 3 Athlon Silver 3050U / 4ГБ / 256SSD / 15.6 / Win10 / (81W100V3RK)",
    "description": "Диагональ дисплея, дюйм : 15.6 , Серия процессора : Athlon Silver , Модель процессора : 3050U , Объём оперативной памяти, ГБ : 4 , Объём SSD накопителя ,ГБ : 256 , Операционная система :Windows 10",
    "price": 174990.0,
    "amount": 12,
    "categories": [
        {
            "id": 1,
            "name": "Ноутбуки и компьютеры"
        }
    ],
    "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/2/a/2a1ede9d14f99b063353de123f2fd80d115cd4cb_227564_1.jpg"
}
````


### POST /rest/api/addGood

Add new good

#### Request body parameters

````
{
        "name": string?, // название товара
        "description": string?, // описание товара
        "price": double?, // цена товара
        "amount": int?, // количество товара
        "categories": [], // категория товара
        "urlOfPicture": string? // изображение товара
    }
````

#### Sample request

````
POST /rest/api/addGodd

{
    "name": "Ноутбук Lenovo IdeaPad 4 Athlon Silver 3050U / 4ГБ / 322SSD / 15.6 / Win10 / (81W100V3RK)",
    "description": "Диагональ дисплея, дюйм : 15.6 , Серия процессора : Athlon Silver , Модель процессора : 3050U , Объём оперативной памяти, ГБ : 4 , Объём SSD накопителя ,ГБ : 256 , Операционная система :Windows 10",
    "price": 250000.0,
    "amount": 1,
    "categories": [
        {
            "id": 1,
            "name": "Ноутбуки и компьютеры"
        }
    ],
    "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/2/a/2a1ede9d14f99b063353de123f2fd80d115cd4cb_227564_1.jpg"
}
````

#### Sample response

````
200 OK 

{
    "id": 16,
    "name": "Ноутбук Lenovo IdeaPad 4 Athlon Silver 3050U / 4ГБ / 322SSD / 15.6 / Win10 / (81W100V3RK)",
    "description": "Диагональ дисплея, дюйм : 15.6 , Серия процессора : Athlon Silver , Модель процессора : 3050U , Объём оперативной памяти, ГБ : 4 , Объём SSD накопителя ,ГБ : 256 , Операционная система :Windows 10",
    "price": 250000.0,
    "amount": 1,
    "categories": [
        {
            "id": 1,
            "name": "Ноутбуки и компьютеры"
        }
    ],
    "urlOfPicture": "https://www.technodom.kz/media/catalog/product/cache/1366e688ed42c99cd6439df4031862c6/2/a/2a1ede9d14f99b063353de123f2fd80d115cd4cb_227564_1.jpg"
}
````



### POST /rest/api/addCategory

Add new category

#### Request body parametres

````
{
    "name":string?
}
````

#### Sample request 

````
POST /rest/api/addCategory


{
    "name": "Техника для кухни"
}
````

#### Sample response

````
200 OK

{
    "id": 5,
    "name": "Техника для кухни"
}
````


 
 ### GET /rest/api/getAllUsers
 
Returns all users of shop
  

 
 #### Sample request
 
 ````
GET /rest/api/getAllUsers
 ````
 
 #### Sample response
 
 ````
 200 OK
 
[
    {
        "id": 1,
        "email": "shinra_tensei@mail.ru",
        "password": "$2a$10$xvIO1uoq00oRLF2giBd5iOtKGmvkhubp2N6CPHBrH4xfDfjcc..K.",
        "fullName": "Yakhiko's Pain",
        "address": "мкр. Туран, ул. Новостройка, 410",
        "city": {
            "id": 1,
            "name": "Алматы"
        },
        "balance": 0.0,
        "blocked": false,
        "roles": [
            {
                "id": 1,
                "name": "ROLE_USER",
                "description": "DEFAULT ROLE FOR ALL USERS",
                "authority": "ROLE_USER"
            }
        ]
    },
    {
        "id": 2,
        "email": "rahat_01_05@mail.ru",
        "password": "$2a$10$fs15UxMamFOzx8I3nhaj1OaYXgngBlym1koXek8B3dznqLa7uPkZO",
        "fullName": "Satybaldy Rakhat",
        "address": null,
        "city": {
            "id": 2,
            "name": "Шымкент"
        },
        "balance": 0.0,
        "blocked": false,
        "roles": [
            {
                "id": 1,
                "name": "ROLE_USER",
                "description": "DEFAULT ROLE FOR ALL USERS",
                "authority": "ROLE_USER"
            }
        ]
    }
]
 ````
 
