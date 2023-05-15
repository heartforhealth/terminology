package io.h4h.terminology

import io.h4h.fhir.r4.base.CodeableEnumeration


enum class Concepts : CodeableEnumeration {

    VitalSignsCategory,
    PlanDefinitionTypeOrderSet,
    BloodPressureMonitor;


    /**
     * Code
     * */
    override val code: String
        get() = when (this) {
            VitalSignsCategory -> "vital-signs"
            PlanDefinitionTypeOrderSet -> "order-set"
            BloodPressureMonitor -> "466086009"
        }

    /**
     * System
     * */
    override val system: String
        get() = when (this) {
            VitalSignsCategory -> "http://hl7.org/fhir/ValueSet/observation-category"
            PlanDefinitionTypeOrderSet -> "http://hl7.org/fhir/ValueSet/plan-definition-type"
            BloodPressureMonitor -> Systems.SNOMED.url
        }


    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            VitalSignsCategory -> "Vital Signs"
            PlanDefinitionTypeOrderSet -> "Order Set"
            BloodPressureMonitor -> "Automatic-inflation electronic sphygmomanometer, portable, arm/wrist (physical object)"
        }

    /// no definition
    override val definition: String? = null


}