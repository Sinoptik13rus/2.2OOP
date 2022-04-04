package ru.netology
import ru.netology.*

import java.util.Objects

data class Post(
    var id: Int, //идентификатор записи
    val ownerId: Int, //идентификатор владельца стены
    val fromId: Int, //идентификатор автора записи
    val createdBy: Int, //идентификатор администратора, который опубликовал
    val date: Int, //время публикации в unixtime
    val text: String, //текст записи
    val replyOwnerId: Int, //идентификатор владельца записи, на которую была оставлена текущая
    val replyPostId: Int, //идентификатор записи, в ответ на которую оставлена текущая
    val friendsOnly: Boolean, //true, если запись создана с опцией "Только для друзей"
    val comments: String, //информация о комментариях к записи
    val copyright: String, //источник материала
    val likes: Int = 0, //информация о лайках к записи
    val reposts: Int, //информация о репостах
    val views: Int, //информация о просмотрах
    val postType: String, //тип записи(post, copy, reply, postpone, suggest)
    val signerId: Int, //идентификатор автора, если запись была выложена сообществом
    val canPin: Boolean, //можно ли закрепить запись
    val canDelete: Boolean, //может ли текущий пользователь удалить запись
    val canEdit: Boolean, //может ли текущий пользователь редактировать запись
    val isPinned: Boolean, //информация о том, что запись закреплена
    val markedAsAds: Boolean, //содержить ли запись отметку реклама
    val ifFavorite: Boolean, //true, ели добавлена в закладку у текущего пользователя
    val donut: String, //информация о записи VK Donut
    val postponedId: Int // идентификатор отложенной записи

) {
}