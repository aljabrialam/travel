
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alamazing.travel.R


class TravelBuddyAdapter(list: ArrayList<TravelBuddyModel>) :
    RecyclerView.Adapter<TravelBuddyAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var subjectImageView: ImageView
//        var subjectTextView: TextView
//        var numOfLikesTextView: TextView

        // Constructor - accepts entire row item
        init {

            // Find each view by id you set up in the list_item.xml
            subjectImageView = itemView.findViewById(R.id.subject_image_view)
//            subjectTextView = itemView.findViewById(R.id.subject_text_view)
//            numOfLikesTextView = itemView.findViewById(R.id.likes_text_view)
        }
    }
    var list: ArrayList<TravelBuddyModel>

    // Creating a viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflate the layout
        val contactView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.travel_buddy_card, parent, false)

        // Return a new holder instance
        return ViewHolder(contactView)
    }

    // Assigning respective data for the views based on the position of the current item
    override fun onBindViewHolder(holder: TravelBuddyAdapter.ViewHolder, position: Int) {
        // Get the Subject based on the current position
        val currentItem: TravelBuddyModel = list[position]

        // Setting views with the corresponding data
        val imageView: ImageView = holder.subjectImageView
        imageView.setImageResource(currentItem.imageId)
    }

    // Indicating how long your data is
    override fun getItemCount(): Int {
        return list.size
    }

    // Constructor
    init {
        this.list = list
    }
}