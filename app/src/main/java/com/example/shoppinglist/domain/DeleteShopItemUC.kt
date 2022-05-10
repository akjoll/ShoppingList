package com.example.shoppinglist.domain

class DeleteShopItemUC(private val shopListRepository: ShopListRepository) {
    fun geleteShopItem(shopItem: ShopItem){
        shopListRepository.geleteShopItem(shopItem)
    }
}