package com.itis.stalkershop.repositories.interfaces

import java.util.*

// K - PK type, T - received item type, R - returned item type
interface Repository<K, in T, R> {
    fun findByPrimaryKey(id: K): Optional<R>?
    fun findAll(): List<R>?
    fun save(item: T): R
    fun update(primaryKey: K, item: T)
    fun delete(primaryKey: K)
}