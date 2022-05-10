package com.example.shoppinglist.domain

class EditShopItemUC(private val shopListRepository: ShopListRepository) {

    fun editShopitem(shopItem: ShopItem){
        shopListRepository.editShopitem(shopItem)
    }
}