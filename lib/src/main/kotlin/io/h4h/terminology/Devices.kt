package io.h4h.terminology

import io.h4h.fhir.r4.base.*


enum class Devices {

    OmronHEM9120,

    IHealthTrackBP550BT,

    IHealthLinaHS2,

    IHealthGlucoBG5SKIT,

    AppleWatch,

    KardiaMobile,

    KardiaMobile6L;


    val display: String
        get() = when(this) {
            OmronHEM9120 -> "Omron HEM-9210T (Blood pressure)"
            IHealthTrackBP550BT -> "iHealth Track (Blood pressure)"
            IHealthLinaHS2 -> "iHealth Lina (Body weight)"
            IHealthGlucoBG5SKIT -> "iHealth Gluco+ BG5S (Glucose)"
            AppleWatch -> "Apple Watch (ECG)"
            KardiaMobile -> "Kardia Mobile 1L (ECG)"
            KardiaMobile6L -> "KardiaMobile 6L (ECG)"
        }


    val manufacturer: String
        get() = when(this) {
            OmronHEM9120 -> "Omron"
            IHealthTrackBP550BT,
            IHealthLinaHS2,
            IHealthGlucoBG5SKIT -> "iHealth"
            AppleWatch -> "Apple"
            KardiaMobile,
            KardiaMobile6L -> "AliveCor"
        }


    val type: CodeableConcept
        get() = when(this) {
            OmronHEM9120,
            IHealthTrackBP550BT -> CodeableConcept(
                coding = listOf(Coding(
                    code = "258057004",
                    display = "Non-invasive blood pressure monitor",
                    system = Systems.SNOMED.url
                ))
            )

            IHealthLinaHS2 -> CodeableConcept(
                coding = listOf(Coding(
                    code = "5042005",
                    display = "Patient scale",
                    system = Systems.SNOMED.url
                ))
            )

            IHealthGlucoBG5SKIT -> CodeableConcept(
                coding = listOf(Coding(
                    code = "354068006",
                    display = "Blood glucose monitoring equipment",
                    system = Systems.SNOMED.url
                ))
            )


            AppleWatch,
            KardiaMobile,
            KardiaMobile6L -> CodeableConcept(
                coding = listOf(Coding(
                    code = "86184003",
                    display = "Electrocardiographic monitor and recorder",
                    system = Systems.SNOMED.url
                ))
            )
        }

}