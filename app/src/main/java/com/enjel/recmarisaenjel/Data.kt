package com.enjel.recmarisaenjel

class Data {
    companion object {
        fun createDataSet(): ArrayList<Food> {
            var list = ArrayList<Food>()
            list.add(
                Food(
                    foodName = "KRISPY BURGER",
                    foodKeterangan = "1 BURGER + extra Saus",
                    foodPrice = "Rp.35.000",
                    foodImage = "https://files.kfcku.com/uploads/media/food-menu/praktis/large/kfc-web_zuper-krunch_l_2.png",
                ),
            )
            list.add(
                Food(
                    foodName = "BBQ BENTO",
                    foodKeterangan = "extra bento + saus",
                    foodPrice = "Rp.55.000",
                    foodImage = "https://files.kfcku.com/uploads/media/food-menu/praktis/large/kfc-web_barbequebento_l.png",
                ),
            )
            list.add(
                Food(
                    foodName = "TWISTY",
                    foodKeterangan = "extra mustrad + double cihicken",
                    foodPrice = "Rp.40.000",
                    foodImage = "https://files.kfcku.com/uploads/media/food-menu/praktis/large/kfc-web_twisty_l_1.png",
                ),
            )
            list.add(
                Food(
                    foodName = "CHOCONUT SUNDAE",
                    foodKeterangan = "extra saus cokelat",
                    foodPrice = "Rp.20.000",
                    foodImage = "https://files.kfcku.com/uploads/media/food-menu/drinks/large/kfc-web_choconutsundae_l.png",
                ),
            )
            list.add(
                Food(
                    foodName = "SPAGHETTI DELUXE",
                    foodKeterangan = "extra saus + regular cup",
                    foodPrice = "Rp.30.000",
                    foodImage = "https://files.kfcku.com/uploads/media/dummy/food/kfc-web_spaghettydeluxe_l.png",
                ),
            )
            val add = list.add(
                Food(
                    foodName = "WINGERS",
                    foodKeterangan = "9 wingers",
                    foodPrice = "Rp.60.000",
                    foodImage = "https://files.kfcku.com/uploads/media/dummy/food/kfc-web_wingers_l.png",
                ),
            )


            return list
        }
    }
}