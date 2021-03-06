package io.h4h.terminology

import io.h4h.fhir.r4.base.CodeableEnumeration


/**
 * Set of terminology concepts
 * */
enum class Observations : CodeableEnumeration {

    BloodPressurePanel,
    BloodPressureSystolic,
    BloodPressureDiastolic,
    HeartRate,
    BodyWeight,
    BodyHeight,
    CholesterolTotal;

    /**
     * Loinc Code
     * */
    override val code: String
        get() = when (this) {
            BloodPressurePanel -> "55417-0"
            BloodPressureSystolic -> "8480-6"
            BloodPressureDiastolic -> "8462-4"
            HeartRate -> "8867-4"
            BodyWeight -> "3141-9"
            BodyHeight -> "8302-2"
            CholesterolTotal -> "14647-2"
        }

    /**
     * Loinc System
     * */
    override val system = "http://loinc.org"


    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            BloodPressurePanel -> "Short blood pressure panel"
            BloodPressureSystolic -> "Systolic blood pressure"
            BloodPressureDiastolic -> "Diastolic blood pressure"
            HeartRate -> "Heart rate"
            BodyWeight -> "Body weight measured"
            BodyHeight -> "Body height"
            CholesterolTotal -> "Cholesterol [Moles/volume] in Serum or Plasma"
        }

    /// no definition
    override val definition: String? = null

}