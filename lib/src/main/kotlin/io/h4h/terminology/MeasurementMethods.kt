package io.h4h.terminology

import io.h4h.fhir.r4.base.CodeableEnumeration

enum class MeasurementMethods : CodeableEnumeration {

    LabPackage,
    LabForm;

    /**
     * Code
     * */
    override val code: String
        get() = when (this) {
            LabPackage -> "444135002"
            LabForm -> "28520004"
        }

    /**
     * System
     * */
    override val system: String
        get() = when (this) {
            LabPackage, LabForm -> Systems.SNOMED.url
        }

    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            LabPackage -> "Lab package - blood withdrawal by patient"
            LabForm -> "Lab form - blood withdrawal by lab"
        }

    override val definition: String? = null

}