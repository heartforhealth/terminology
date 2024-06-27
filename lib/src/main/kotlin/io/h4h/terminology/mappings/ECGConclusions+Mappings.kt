package io.h4h.terminology.mappings

import io.h4h.terminology.ECGConclusions
import io.h4h.terminology.codesets.AppleWatchEKGClassification
import io.h4h.terminology.codesets.AppleWatchEKGClassification.*
import io.h4h.terminology.codesets.KardiaEKGClassification
import io.h4h.terminology.codesets.KardiaEKGClassification.*




fun AppleWatchEKGClassification.toECGConclusion(): List<ECGConclusions> = when (this) {
    notSet -> TODO()
    sinusRhythm -> listOf(ECGConclusions.SinusRhythm)
    atrialFibrillation -> listOf(ECGConclusions.AtrialFibrillation)
    inconclusiveLowHeartRate -> TODO()
    inconclusiveHighHeartRate -> TODO()
    inconclusivePoorReading -> TODO()
    inconclusiveOther -> TODO()
    unrecognized -> TODO()
}


fun KardiaEKGClassification.toECGConclusion(): List<ECGConclusions> = when (this) {
    normal -> TODO()
    sinus_rhythm -> listOf(ECGConclusions.SinusRhythm)
    afib -> listOf(ECGConclusions.AtrialFibrillation)
    bradycardia -> TODO()
    no_analysis -> TODO()
    sinus_rhythm_multiple_pacs -> listOf(ECGConclusions.SinusRhythm, ECGConclusions.PrematureAtrialComplexes)
    sinus_rhythm_multiple_pvcs -> listOf(ECGConclusions.SinusRhythm, ECGConclusions.PrematureVentricularComplexes)
    sinus_rhythm_wide_qrs -> TODO()
    tachycardia -> TODO()
    too_long -> TODO()
    too_short -> TODO()
    unclassified -> TODO()
    unreadable -> TODO()
}