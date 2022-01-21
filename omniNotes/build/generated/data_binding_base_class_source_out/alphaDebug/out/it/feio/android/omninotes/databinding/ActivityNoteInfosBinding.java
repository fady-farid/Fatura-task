// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import it.feio.android.omninotes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNoteInfosBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView noteInfosAudiorecordings;

  @NonNull
  public final TextView noteInfosCategory;

  @NonNull
  public final TextView noteInfosChars;

  @NonNull
  public final TextView noteInfosChecklistItems;

  @NonNull
  public final TextView noteInfosCompletedChecklistItems;

  @NonNull
  public final TextView noteInfosFiles;

  @NonNull
  public final TextView noteInfosImages;

  @NonNull
  public final TextView noteInfosSketches;

  @NonNull
  public final TextView noteInfosTags;

  @NonNull
  public final TextView noteInfosVideos;

  @NonNull
  public final TextView noteInfosWords;

  private ActivityNoteInfosBinding(@NonNull LinearLayout rootView,
      @NonNull TextView noteInfosAudiorecordings, @NonNull TextView noteInfosCategory,
      @NonNull TextView noteInfosChars, @NonNull TextView noteInfosChecklistItems,
      @NonNull TextView noteInfosCompletedChecklistItems, @NonNull TextView noteInfosFiles,
      @NonNull TextView noteInfosImages, @NonNull TextView noteInfosSketches,
      @NonNull TextView noteInfosTags, @NonNull TextView noteInfosVideos,
      @NonNull TextView noteInfosWords) {
    this.rootView = rootView;
    this.noteInfosAudiorecordings = noteInfosAudiorecordings;
    this.noteInfosCategory = noteInfosCategory;
    this.noteInfosChars = noteInfosChars;
    this.noteInfosChecklistItems = noteInfosChecklistItems;
    this.noteInfosCompletedChecklistItems = noteInfosCompletedChecklistItems;
    this.noteInfosFiles = noteInfosFiles;
    this.noteInfosImages = noteInfosImages;
    this.noteInfosSketches = noteInfosSketches;
    this.noteInfosTags = noteInfosTags;
    this.noteInfosVideos = noteInfosVideos;
    this.noteInfosWords = noteInfosWords;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNoteInfosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNoteInfosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_note_infos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNoteInfosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.note_infos_audiorecordings;
      TextView noteInfosAudiorecordings = rootView.findViewById(id);
      if (noteInfosAudiorecordings == null) {
        break missingId;
      }

      id = R.id.note_infos_category;
      TextView noteInfosCategory = rootView.findViewById(id);
      if (noteInfosCategory == null) {
        break missingId;
      }

      id = R.id.note_infos_chars;
      TextView noteInfosChars = rootView.findViewById(id);
      if (noteInfosChars == null) {
        break missingId;
      }

      id = R.id.note_infos_checklist_items;
      TextView noteInfosChecklistItems = rootView.findViewById(id);
      if (noteInfosChecklistItems == null) {
        break missingId;
      }

      id = R.id.note_infos_completed_checklist_items;
      TextView noteInfosCompletedChecklistItems = rootView.findViewById(id);
      if (noteInfosCompletedChecklistItems == null) {
        break missingId;
      }

      id = R.id.note_infos_files;
      TextView noteInfosFiles = rootView.findViewById(id);
      if (noteInfosFiles == null) {
        break missingId;
      }

      id = R.id.note_infos_images;
      TextView noteInfosImages = rootView.findViewById(id);
      if (noteInfosImages == null) {
        break missingId;
      }

      id = R.id.note_infos_sketches;
      TextView noteInfosSketches = rootView.findViewById(id);
      if (noteInfosSketches == null) {
        break missingId;
      }

      id = R.id.note_infos_tags;
      TextView noteInfosTags = rootView.findViewById(id);
      if (noteInfosTags == null) {
        break missingId;
      }

      id = R.id.note_infos_videos;
      TextView noteInfosVideos = rootView.findViewById(id);
      if (noteInfosVideos == null) {
        break missingId;
      }

      id = R.id.note_infos_words;
      TextView noteInfosWords = rootView.findViewById(id);
      if (noteInfosWords == null) {
        break missingId;
      }

      return new ActivityNoteInfosBinding((LinearLayout) rootView, noteInfosAudiorecordings,
          noteInfosCategory, noteInfosChars, noteInfosChecklistItems,
          noteInfosCompletedChecklistItems, noteInfosFiles, noteInfosImages, noteInfosSketches,
          noteInfosTags, noteInfosVideos, noteInfosWords);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}