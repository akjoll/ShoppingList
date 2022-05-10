package com.example.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppinglist.data.ShopListPepositoryImpl
import com.example.shoppinglist.domain.DeleteShopItemUC
import com.example.shoppinglist.domain.EditShopItemUC
import com.example.shoppinglist.domain.GetShopListUseCase
import com.example.shoppinglist.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListPepositoryImpl
    private val getShopListUC = GetShopListUseCase(repository)
    private val deleteShopItemUC = DeleteShopItemUC(repository)
    private val editShopItemUC = EditShopItemUC(repository)

    val shopList = getShopListUC.getShopList()

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUC.geleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUC.editShopitem(newItem)
    }
}