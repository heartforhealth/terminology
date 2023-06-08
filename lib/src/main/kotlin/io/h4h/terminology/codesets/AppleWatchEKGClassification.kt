package io.h4h.terminology.codesets

import io.h4h.fhir.r4.base.CodeableEnumeration


/**
 * HKElectrocardiogram.Classification enumeration, part of Apple HealthKit
 *
 * Apple Watch Series 4 and above has an electrical heart sensor that, when using the ECG app, enables the generation and analysis of an ECG similar to a Lead I ECG. The internal EKG algorithm already generates an interpretation according to this enum.
 * */
enum class AppleWatchEKGClassification : CodeableEnumeration {

    notSet,
    sinusRhythm,
    atrialFibrillation,
    inconclusiveLowHeartRate,
    inconclusiveHighHeartRate,
    inconclusivePoorReading,
    inconclusiveOther,
    unrecognized;


    /**
     * Code
     * */
    override val code: String
        get() = name


    /**
     * Loinc System
     * */
    override val system = "com.apple.health.HKElectrocardiogram.Classification"


    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            notSet -> "No classification is set on this sample"
            sinusRhythm -> "The sample exhibits no signs of atrial fibrillation"
            atrialFibrillation -> "The sample exhibits signs of atrial fibrillation"
            inconclusiveLowHeartRate -> "The sample classifier could not check for atrial fibrillation due to a heart rate under 50 BPM"
            inconclusiveHighHeartRate -> "The sample classifier could not check for atrial fibrillation due to a high heart rate"
            inconclusivePoorReading -> "The sample classifier did not attempt a classification due to not meeting the signal requirements"
            inconclusiveOther -> "The sample classifier could not determine a classification"
            unrecognized -> "The classification created for this sample is unrecognized on this device"
        }


    /**
     * Definition
     * */
    override val definition: String?
        get() = display

}
