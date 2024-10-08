package com.example.september24.domain.usecases

import com.example.september24.domain.ReminderRepository
import com.example.september24.domain.models.Reminder
import kotlinx.coroutines.flow.Flow

class GetRemindersUseCase(private val reminderRepository: ReminderRepository) {
    operator fun invoke(): Flow<List<Reminder>> {
        return reminderRepository.getAllReminders()
    }
}