package vcmsa.ci.imad5112practicum

import android.content.Intent
import android.media.Rating
import android.os.Bundle
import android.service.quicksettings.Tile
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.jar.Attributes.Name

class ActivityInput : AppCompatActivity() {

    // Updated list names to match the input fields more clearly
    private val titleList = arrayListOf<String>()          // Stores the title of the song (e.g. Call out my name)
    private val nameList = arrayListOf<String>()     // Stores the name of the artist (e.g. Artist C)
    private val ratingList = arrayListOf<Int>()        // Stores rating of the songs in the playlist (e.g. 3)
    private val commentList = arrayListOf<String>()      // Stores comments of the user (e.g. Rap)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.PlaylistInputScreen)

        // Link UI elements to Kotlin variables using exact XML IDs
        val inputSongTitle = findViewById<EditText>(R.id.inputSongTitle)
        val inputArtistName = findViewById<EditText>(R.id.inputArtistName)
        val inputRating = findViewById<EditText>(R.id.inputRating)
        val inputUserComments = findViewById<EditText>(R.id.inputUserComments)

        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonView = findViewById<Button>(R.id.buttonView)
        val buttonExit = findViewById<Button>(R.id.buttonExit)
        val buttonClear = findViewById<Button>(R.id.buttonClear)

        // Add to list button
        buttonAdd.setOnClickListener {
            val title = inputSongTitle.text.toString()
            val name = inputArtistName.text.toString()
            val rating = inputRating.text.toString()
            val comment = inputUserComments.text.toString()

            // Validate input
            if (title.isBlank() || name.isBlank() || rating.isBlank()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val quantity = rating.toIntOrNull()
            if (quantity == null || quantity <= 0) {
                Toast.makeText(this, "Rating must be a positive number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Add values to lists
            titleList.add(title)
            nameList.add(name)
            ratingList.add(rating)
            commentList.add(comment)

            Toast.makeText(this, "Song added to the list", Toast.LENGTH_SHORT).show()

            // Clear input fields
            inputSongTitle.text.clear()
            inputArtistName.text.clear()
            inputRating.text.clear()
            inputUserComments.text.clear()
        }

        // View list button
        buttonView.setOnClickListener {
            val intent = Intent(this, PlaylistDispay::class.java)
            intent.putStringArrayListExtra("titleList", titleList)
            intent.putStringArrayListExtra("nameList", nameList)
            intent.putIntegerArrayListExtra("quantityList", ratingList)
            intent.putStringArrayListExtra("commentList", commentList)
            startActivity(intent)
        }

        // Clear input fields
        buttonClear.setOnClickListener {
            inputSongTitle.text.clear()
            inputArtistName.text.clear()
            inputRating.text.clear()
            inputUserComments.text.clear()
            Toast.makeText(this, "Inputs cleared!", Toast.LENGTH_SHORT).show()
        }

        // Exit app
        buttonExit.setOnClickListener {
            finishAffinity() // Close the app completely
        }
    }
}