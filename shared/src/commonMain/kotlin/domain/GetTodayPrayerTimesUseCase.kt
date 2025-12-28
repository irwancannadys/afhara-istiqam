package com.afhara.istiqam.shared.domain

class GetTodayPrayerTimesUseCase {

    fun execute(): List<PrayerTime> {
        return listOf(
            PrayerTime("Subuh", "04:30"),
            PrayerTime("Dzuhur", "12:00"),
            PrayerTime("Ashar", "15:20"),
            PrayerTime("Maghrib", "18:00"),
            PrayerTime("Isya", "19:10")
        )
    }
}
