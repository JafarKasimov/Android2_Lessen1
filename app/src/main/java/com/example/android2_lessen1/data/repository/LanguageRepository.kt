package com.example.android2_lessen1.data.repository

import com.example.android2_lessen1.data.model.CatsModel

class LanguageRepository {
    private var catList = arrayListOf<CatsModel>()

    fun getListOfText(): MutableList<CatsModel> {
        catList.clear()
        catList.add(
            CatsModel(
                "02", "https://thumbs.dfs.ivi.ru/storage2/contents/6/0/e926217" +
                        "def93b26e6150939c0330.jpg/234x360/?q=60"
            )
        )
        catList.add(
            CatsModel(
                "02.1", "https://cdnn11.img.sputnik.by/img/07e5/0a/1b/1057486154_0:0:1712:" +
                        "963_1920x0_80_0_0_5f9636f0290a4de0b79e008ca35ddf43.jpg"
            )
        )
        catList.add(CatsModel("02.2", "https://b1.filmpro.ru/c/812189.246x347.jpg"))
        catList.add(
            CatsModel(
                "02.3",
                "https://thumbs.dfs.ivi.ru/storage26/contents/5/c/21c7c18bfe111e6e0ab01b43121f2c.jpg"
            )
        )
        catList.add(
            CatsModel(
                "02.4",
                "https://mf-static-ssl.more.tv/jackal/2607461/fad017ca-dbf3-4938-93bb-3b691132b518_W250_H355.webp"
            )
        )
        catList.add(
            CatsModel(
                "02.5",
                "https://mf-static-ssl.more.tv/jackal/2607461/fad017ca-dbf3-4938-93bb-3b691132b518_W250_H355.webp"
            )
        )
        catList.add(
            CatsModel(
                "02.6", "https://ms1.relax.by/images/d4b21593f3f04b3b118e37d5e68927ff/thumb/" +
                        "w%3D400%2Ch%3D600%2Cq%3D90/oafish_event_photo/de/eb/95/deep95794d2e9aa1fce6c1glibc34270.jpg"
            )
        )
        catList.add(
            CatsModel(
                "02.7",
                "https://mf-static-ssl.more.tv/jackal/2586885/1cbd15b5-02cf-47af-a747-a651e1d3d288_W250_H355.webp"
            )
        )
        catList.add(
            CatsModel(
                "02.8",
                "https://api.start.ru/images/unsafe/630x900/filters:format(webp):watermark(18.png" +
                        ",15,-0,0,15,15)/7c5c0f46bdf24623805714a1548abf3f/vertical_15x?size=172x245"
            )
        )
        catList.add(CatsModel("02.9", "https://www.kino-teatr.ru/movie/posters/big/1/146951.jpg"))
        catList.add(
            CatsModel(
                "02.10",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfJIxyQcVfWKMU_RnUxkvCH_3gn1_fyawE9Q&usqp=CAU"
            )
        )
        catList.add(
            CatsModel(
                "02.11",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQdVA_gFEDnjkc8MTtJ5HnWRrP3pSLHwOhJ5w&usqp=CAU"
            )
        )
        catList.add(
            CatsModel(
                "02.12",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5vlSVHd0VFSoU1uQpjBx6cvWeHfkLEgw2vg&usqp=CAU"
            )
        )
        catList.add(CatsModel("02.13", "https://images.kinomax.ru/550/films/6/6576/p_ceaf2ca.jpg"))
        catList.add(
            CatsModel(
                "02.14",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSdzd7tenI5fBPpaoLAURLSQVLCqh-Esh9Fg&usqp=CAU"
            )
        )
        catList.add(
            CatsModel(
                "02.15",
                "https://thumbs.dfs.ivi.ru/storage29/contents/c/4/f3b4f712ab844ed3349bc9dede0e40.jpg"
            )
        )
        catList.add(
            CatsModel(
                "02.16",
                "https://photo.tvigle.ru/crop/245x350/res/tvigle/product/2022/01/20/e71f4f04-02e9-43e1-8274-e5133e6b75e2.jpg"
            )
        )
        catList.add(
            CatsModel(
                "02.17",
                "https://s5.vcdn.biz/static/f/5021664971/image.jpg/pt/r193x272x4"
            )
        )
        catList.add(
            CatsModel(
                "02.18",
                "https://avatars.mds.yandex.net/get-kinopoisk-image/4483445/db987680-608a-4bce-a284-f6950386999a/600x900"
            )
        )
        return catList
    }
}