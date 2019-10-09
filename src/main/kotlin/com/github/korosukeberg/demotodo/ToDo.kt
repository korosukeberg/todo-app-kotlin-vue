package com.github.korosukeberg.demotodo

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "todo")
data class ToDo(
    @Id
    @GeneratedValue
    var id: Long = -1,
    var title: String = "",
    var completed: Boolean = false,
    @Column(name = "createddate")
    var createdDate: LocalDateTime = LocalDateTime.now()
) {}
