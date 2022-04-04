package ru.netology

import org.junit.Test

import org.junit.Assert.*
import ru.netology.*

class WallServiceTest {

    @Test
    fun addTest() {
        val actualExpected = 1

        val post = Post(
            id = 1, ownerId = 22, fromId = 4, createdBy = 17, date = 123456789,
            text = "text", replyOwnerId = 777, replyPostId = 15, friendsOnly = true,
            comments = "comments", copyright = "copyright", likes = 22,
            reposts = 44, views = 1717, postType = "reply", signerId = 123,
            canPin = true, canDelete = true, canEdit = true, isPinned = true,
            markedAsAds = true, ifFavorite = true, donut = "donut", postponedId = 123
        )

        assertEquals(post.id, actualExpected)
    }

    @Test
    fun updateTestTrue() {
        val result = WallService
        result.add(
            Post(
                id = 101, ownerId = 22, fromId = 4, createdBy = 17, date = 123456789,
                text = "text", replyOwnerId = 777, replyPostId = 15, friendsOnly = true,
                comments = "comments", copyright = "copyright", likes = 12,
                reposts = 22, views = 33, postType = "reply", signerId = 123,
                canPin = true, canDelete = true, canEdit = true, isPinned = true,
                markedAsAds = true, ifFavorite = true, donut = "donut", postponedId = 123
            )
        )

        result.add(
            Post(
                id = 2, ownerId = 22, fromId = 4, createdBy = 17, date = 123456789,
                text = "text", replyOwnerId = 777, replyPostId = 15, friendsOnly = true,
                comments = "comments", copyright = "copyright", likes = 12,
                reposts = 22, views = 33, postType = "reply", signerId = 123,
                canPin = true, canDelete = true, canEdit = true, isPinned = true,
                markedAsAds = true, ifFavorite = true, donut = "donut", postponedId = 123
            )
        )

        val resultUpdate = Post(
            id = 1, ownerId = 222, fromId = 44, createdBy = 117, date = 13456789,
            text = "text1", replyOwnerId = 7777, replyPostId = 15, friendsOnly = true,
            comments = "comments", copyright = "copyright", likes = 12,
            reposts = 21, views = 21, postType = "reply", signerId = 1234,
            canPin = false, canDelete = false, canEdit = false, isPinned = false,
            markedAsAds = false, ifFavorite = false, donut = "donut1", postponedId = 1234
        )
        val finishResult = result.update(resultUpdate)
        assertTrue(finishResult)
    }

    @Test
    fun updateTestFalse() {
        val result = WallService
        result.add(
            Post(
                id = 1, ownerId = 22, fromId = 4, createdBy = 17, date = 123456789,
                text = "text", replyOwnerId = 777, replyPostId = 15, friendsOnly = true,
                comments = "comments", copyright = "copyright", likes = 22,
                reposts = 44, views = 1717, postType = "reply", signerId = 123,
                canPin = true, canDelete = true, canEdit = true, isPinned = true,
                markedAsAds = true, ifFavorite = true, donut = "donut", postponedId = 123
            )
        )

        result.add(
            Post(
                id = 12, ownerId = 22, fromId = 4, createdBy = 17, date = 123456789,
                text = "text", replyOwnerId = 777, replyPostId = 15, friendsOnly = true,
                comments = "comments", copyright = "copyright", likes = 22,
                reposts = 44, views = 1717, postType = "reply", signerId = 123,
                canPin = true, canDelete = true, canEdit = true, isPinned = true,
                markedAsAds = true, ifFavorite = true, donut = "donut", postponedId = 123
            )
        )

        val resultUpdate = Post(
            id = 12, ownerId = 222, fromId = 44, createdBy = 117, date = 13456789,
            text = "text1", replyOwnerId = 7777, replyPostId = 15, friendsOnly = true,
            comments = "comments", copyright = "copyright", likes = 222,
            reposts = 44, views = 1717, postType = "reply", signerId = 1234,
            canPin = false, canDelete = false, canEdit = false, isPinned = false,
            markedAsAds = false, ifFavorite = false, donut = "donut1", postponedId = 1234
        )
        val finishResult = result.update(resultUpdate)
        assertFalse(finishResult)
    }


}