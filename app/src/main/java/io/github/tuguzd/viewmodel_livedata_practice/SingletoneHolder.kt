package io.github.tuguzd.viewmodel_livedata_practice

abstract class SingletonHolder<T> {
    protected abstract val constructor: () -> T
    val instance: T by lazy { constructor() }
}
