package dnd.madang.jang.Findidpw


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dnd.madang.jang.R

/**
 * A simple [Fragment] subclass.
 */
class FindpwFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_findpw, container, false)
    }
}
