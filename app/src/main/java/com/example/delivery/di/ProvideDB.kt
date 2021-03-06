package com.example.delivery.di

import android.content.Context
import androidx.room.Room
import com.example.delivery.data.db.ApplicationDatabase

/* 4. 기본 설정 및 data :
*  DB를 생성하고, 각각의 column에 대한 CRUD
*/

fun provideDB(context: Context): ApplicationDatabase =
    Room.databaseBuilder(context, ApplicationDatabase::class.java, ApplicationDatabase.DB_NAME).build()

fun provideLocationDao(database: ApplicationDatabase) = database.LocationDao()

fun provideFoodMenuBasketDao(database: ApplicationDatabase) = database.FoodMenuBasketDao()

fun provideRestaurantDao(database: ApplicationDatabase) = database.RestaurantDao()

