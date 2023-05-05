package com.wa2c.android.cifsdocumentsprovider.presentation.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.mikepenz.aboutlibraries.LibsBuilder
import com.mikepenz.aboutlibraries.ui.LibsSupportFragment
import com.wa2c.android.cifsdocumentsprovider.presentation.R

/**
 * Library Screen
 */
class LibraryFragment: LibsSupportFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arguments = bundleOf().apply {
            putSerializable(
                "data",
                LibsBuilder()
                    .withActivityTitle(getString(R.string.settings_title))
                    .withAboutIconShown(true)
                    .withAboutVersionShown(true)
            )
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}