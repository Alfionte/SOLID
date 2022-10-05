import liscov.substitution.principle.LiscovPrincipleWrongUseCase
import open.close.principle.right.OpenClosePrincipleRightUseCase
import open.close.principle.wrong.OpenClosePrincipleWrongUseCase
import single.responsibility.principle.wrong.SingleResponsibilityPrincipleWrongUseCase
import single.responsibility.principle.right.SingleResponsibilityPrincipleRightUseCase

fun main() {
    SingleResponsibilityPrincipleWrongUseCase.runExample()
    SingleResponsibilityPrincipleRightUseCase.runExample()

    OpenClosePrincipleWrongUseCase.runExample()
    OpenClosePrincipleRightUseCase.runExample()

    LiscovPrincipleWrongUseCase.runExample()
}