package app.k9mail.feature.account.setup.ui

import app.k9mail.core.common.provider.BrandNameProvider

internal object FakeBrandNameProvider : BrandNameProvider {
    override val brandName: String = "Fake Brand Name"
}