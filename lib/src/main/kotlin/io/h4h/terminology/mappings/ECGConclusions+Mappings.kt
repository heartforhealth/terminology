package io.h4h.terminology.mappings

import io.h4h.terminology.ECGConclusions
import io.h4h.terminology.codesets.AppleWatchECGClassification
import io.h4h.terminology.codesets.AppleWatchECGClassification.*
import io.h4h.terminology.codesets.KardiaECGClassification
import io.h4h.terminology.codesets.KardiaECGClassification.*



fun AppleWatchECGClassification.toECGConclusion(): List<ECGConclusions> = when (this) {
    notSet -> listOf(ECGConclusions.Unclassified)
    sinusRhythm -> listOf(ECGConclusions.SinusRhythm)
    atrialFibrillation -> listOf(ECGConclusions.AtrialFibrillation)
    inconclusiveLowHeartRate -> listOf(ECGConclusions.SinusBradycardia)
    inconclusiveHighHeartRate -> listOf(ECGConclusions.SinusTachycardia)
    inconclusivePoorReading -> listOf(ECGConclusions.Noise)
    inconclusiveOther -> listOf(ECGConclusions.Unclassified)
    unrecognized -> listOf(ECGConclusions.Noise)
}


fun KardiaECGClassification.toECGConclusion(): List<ECGConclusions> = when (this) {
    normal -> listOf(ECGConclusions.SinusRhythm)
    sinus_rhythm -> listOf(ECGConclusions.SinusRhythm)
    afib -> listOf(ECGConclusions.AtrialFibrillation)
    bradycardia -> listOf(ECGConclusions.SinusBradycardia)
    tachycardia -> listOf(ECGConclusions.SinusTachycardia)
    sinus_rhythm_multiple_pacs -> listOf(ECGConclusions.SinusRhythm, ECGConclusions.PrematureAtrialComplexes)
    sinus_rhythm_multiple_pvcs -> listOf(ECGConclusions.SinusRhythm, ECGConclusions.PrematureVentricularComplexes)
    sinus_rhythm_wide_qrs -> listOf(ECGConclusions.SinusRhythm, ECGConclusions.BundleBranchBlock)

    no_analysis -> listOf(ECGConclusions.Unclassified)
    too_long -> listOf(ECGConclusions.TooLong)
    too_short -> listOf(ECGConclusions.TooShort)
    unclassified -> listOf(ECGConclusions.Unclassified)
    unreadable -> listOf(ECGConclusions.NoAssessmentPossible)
}
