import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.fragmentproject.Fragment_One
import com.example.fragmentproject.R

class Custom_Dialog  : DialogFragment (){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.dialog_fragment, container, false)

        rootView.findViewById<Button>(R.id.cancelButton).setOnClickListener{
            dismiss()
        }

        rootView.findViewById<Button>(R.id.submitButton).setOnClickListener{
            val selectedID = rootView.findViewById<RadioGroup>(R.id.ratingRadioGroup).checkedRadioButtonId
            val radio = rootView.findViewById<RadioButton>(selectedID)
            var ratingResult = radio.text.toString()
            Toast.makeText(context,"You rated: $ratingResult",Toast.LENGTH_LONG).show()
            dismiss()
        }

        return rootView

    }
}