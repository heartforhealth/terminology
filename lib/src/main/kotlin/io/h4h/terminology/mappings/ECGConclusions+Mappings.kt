package io.h4h.terminology.mappings

import io.h4h.terminology.ECGConclusions
import io.h4h.terminology.codesets.AppleWatchEKGClassification
import io.h4h.terminology.codesets.AppleWatchEKGClassification.*
import io.h4h.terminology.codesets.KardiaEKGClassification
import io.h4h.terminology.codesets.KardiaEKGClassification.*


fun AppleWatchEKGClassification.toECGConclusion(): List<ECGConclusions> = when (this) {
    notSet -> listOf(ECGConclusions.Unclassified)
    sinusRhythm -> listOf(ECGConclusions.SinusRhythm)
    atrialFibrillation -> listOf(ECGConclusions.AtrialFibrillation)
    inconclusiveLowHeartRate -> listOf(ECGConclusions.SinusBradycardia)
    inconclusiveHighHeartRate -> listOf(ECGConclusions.SinusTachycardia)
    inconclusivePoorReading -> listOf(ECGConclusions.Noise)
    inconclusiveOther -> listOf(ECGConclusions.Unclassified)
    unrecognized -> listOf(ECGConclusions.Noise)
}


fun KardiaEKGClassification.toECGConclusion(): List<ECGConclusions> = when (this) {
    normal -> listOf(ECGConclusions.SinusRhythm)
    sinus_rhythm -> listOf(ECGConclusions.SinusRhythm)
    afib -> listOf(ECGConclusions.AtrialFibrillation)
    bradycardia -> listOf(ECGConclusions.SinusTachycardia)
    no_analysis -> listOf(ECGConclusions.Unclassified)
    sinus_rhythm_multiple_pacs -> listOf(ECGConclusions.SinusRhythm, ECGConclusions.PrematureAtrialComplexes)
    sinus_rhythm_multiple_pvcs -> listOf(ECGConclusions.SinusRhythm, ECGConclusions.PrematureVentricularComplexes)
    sinus_rhythm_wide_qrs -> listOf(ECGConclusions.SinusRhythm, ECGConclusions.BundleBranchBlock)
    tachycardia -> listOf(ECGConclusions.SinusTachycardia)
    too_long -> TODO()
    too_short -> TODO()
    unclassified -> TODO()
    unreadable -> TODO()
}