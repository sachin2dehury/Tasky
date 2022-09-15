package com.mk.tasky.agenda.data.mapper

import com.mk.tasky.agenda.data.local.entity.ReminderEntity
import com.mk.tasky.agenda.data.remote.dto.ReminderDto
import com.mk.tasky.agenda.domain.model.Reminder
import com.mk.tasky.agenda.util.TimeUtil.longToTime
import com.mk.tasky.agenda.util.TimeUtil.timeToLong

fun Reminder.toEntity(): ReminderEntity {
    return ReminderEntity(
        id = this.id,
        title = this.title,
        description = this.description,
        remindAt = timeToLong(this.remindAt),
        dateTime = timeToLong(this.dateTime)
    )
}

fun Reminder.toDto(): ReminderDto {
    return ReminderDto(
        id = this.id,
        title = this.title,
        description = this.description,
        time = timeToLong(this.dateTime),
        remindAt = timeToLong(this.remindAt)
    )
}

fun ReminderEntity.toDomain(): Reminder {
    return Reminder(
        id = this.id,
        title = this.title,
        description = this.description,
        remindAt = longToTime(this.remindAt),
        dateTime = longToTime(this.dateTime)
    )
}

fun ReminderDto.toDomain(): Reminder {
    return Reminder(
        id = this.id,
        title = this.title,
        description = this.description,
        remindAt = longToTime(this.remindAt),
        dateTime = longToTime(this.time)
    )
}
