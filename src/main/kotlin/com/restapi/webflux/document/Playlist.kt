package com.restapi.webflux.document

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Playlist(
    @Id
    val id: String? = null,

    val name: String
)
