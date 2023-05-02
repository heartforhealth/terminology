package io.h4h.terminology.codesets

import io.h4h.fhir.r4.base.CodeableEnumeration



/**
 * https://loinc.org/55420-4
 * Time in hours between current event, such as a glucose test and last meal.
 * */
enum class HoursAfterMeal : CodeableEnumeration {

    Hours1,
    Hours2,
    Hours3,
    Fasting;


    /**
     * SNOMED CT Code
     * */
    override val code: String
        get() = when (this) {
            Hours1 -> "LA11828-3"
            Hours2 -> "LA11829-1"
            Hours3 -> "LA11830-9"
            Fasting -> "LA11831-7"
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
            Hours1 -> "1 hour"
            Hours2 -> "2 hours"
            Hours3 -> "3 hours"
            Fasting -> "Fasting"
        }

    /// no definition
    override val definition: String? = null
}