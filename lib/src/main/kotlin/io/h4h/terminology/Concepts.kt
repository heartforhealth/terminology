package io.h4h.terminology

import io.h4h.fhir.r4.base.CodeableEnumeration


enum class Concepts : CodeableEnumeration {

    VitalSignsCategory,
    PlanDefinitionTypeOrderSet,
    BloodPressureMonitor,
    Procedure,
    Symptom;


    /**
     * Code
     * */
    override val code: String
        get() = when (this) {
            VitalSignsCategory -> "vital-signs"
            PlanDefinitionTypeOrderSet -> "order-set"
            BloodPressureMonitor -> "466086009"
            Procedure -> "procedure"
            Symptom -> "75325-1"
        }

    /**
     * System
     * */
    override val system: String
        get() = when (this) {
            VitalSignsCategory -> "http://hl7.org/fhir/ValueSet/observation-category"
            PlanDefinitionTypeOrderSet -> "http://hl7.org/fhir/ValueSet/plan-definition-type"
            BloodPressureMonitor -> Systems.SNOMED.url
            Procedure -> "https://www.hl7.org/fhir/procedure.html"
            Symptom -> Systems.Loinc.url
        }


    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            VitalSignsCategory -> "Vital Signs"
            PlanDefinitionTypeOrderSet -> "Order Set"
            BloodPressureMonitor -> "Automatic-inflation electronic sphygmomanometer, portable, arm/wrist (physical object)"
            Procedure -> name
            Symptom -> name
        }


    /// no definition
    override val definition: String? = null

}