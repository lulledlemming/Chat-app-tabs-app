package com.dandy.coltabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

// ":" symbol indicates that HomeFragment is a child class of Fragment Class
class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate (
            R.layout.layout_home, container, false
        )
    }
    // Here "layout_chats" is a name of the layout file created for ChatsFragment
}