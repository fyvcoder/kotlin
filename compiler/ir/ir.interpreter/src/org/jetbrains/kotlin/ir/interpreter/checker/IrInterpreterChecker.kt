/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.interpreter.checker

import org.jetbrains.kotlin.ir.interpreter.IrInterpreterConfiguration
import org.jetbrains.kotlin.ir.visitors.IrElementVisitor

interface IrInterpreterChecker : IrElementVisitor<Boolean, IrInterpreterCheckerData> {
    val mode: EvaluationMode
}

class IrInterpreterCheckerData(
    val interpreterConfiguration: IrInterpreterConfiguration
)