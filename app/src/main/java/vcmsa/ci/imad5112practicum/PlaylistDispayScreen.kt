package vcmsa.ci.imad5112practicum

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityDisplay : AppCompatActivity() {

    // UI components matching the new XML IDs
    private lateinit var buttonShowAll: Button
    private lateinit var buttonShowRatings: Button
    private lateinit var buttonBackToHome: Button
    private lateinit var displaySongs: TextView
    private lateinit var displayFilteredSongs: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.PlaylistDispayScreen)

        // Link Kotlin variables to views using updated XML IDs
        buttonShowAll = findViewById(R.id.buttonShowAll)
        buttonShowRatings = findViewById(R.id.buttonShowRatings)
        buttonBackToHome = findViewById(R.id.buttonBackToHome)
        displaySongs = findViewById(R.id.displaySongs)
        displayFilteredSongs = findViewById(R.id.displayFilteredSongs)

        // Retrieve data passed from ActivityInput using updated key names
        val titleList = intent.getStringArrayListExtra("titleList")
        val nameList = intent.getStringArrayListExtra("nameList")
        val ratingList = intent.getIntegerArrayListExtra("ratingList")
        val commentList = intent.getStringArrayListExtra("commentList")

        // Show all items from the packing list
        buttonShowAll.setOnClickListener {
            if (titleList != null && nameList != null && ratingList != null && commentList != null) {
                val fullList = titleList.indices.joinToString("\n") {
                    "${titleList[it]} (${nameList[it]}) - ${ratingList[it]}: ${commentList[it]}"
                }
                displaySongs.text = fullList.ifBlank { "No songs added." }
            } else {
                displaySongs.text = "No songs added."
            }
        }

        // Show only items with quantity 2 or more
        displayFilteredSongs.setOnClickListener {
            if (titleList != null && ratingList != null) {
                val filtered = titleList.indices
                    .filter { ratingList[it] < 5 }
                    .joinToString("\n") {
                        "${titleList[it]} (Quantity: ${ratingList[it]})"
                    }
                displayFilteredSongs.text = filtered.ifBlank { "No items with < 5 added." }
            } else {
                displayFilteredSongs.text = "No items with quantity < 5 added."
            }
        }

        // Return to the input screen
        buttonBackToHome.setOnClickListener {
            finish()
        }
    }
}