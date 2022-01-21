// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import it.feio.android.omninotes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWidgetConfigurationBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CheckBox showThumbnails;

  @NonNull
  public final CheckBox showTimestamps;

  @NonNull
  public final RadioButton widgetConfigCategories;

  @NonNull
  public final Button widgetConfigConfirm;

  @NonNull
  public final RadioButton widgetConfigNotes;

  @NonNull
  public final RadioGroup widgetConfigRadiogroup;

  @NonNull
  public final Spinner widgetConfigSpinner;

  private ActivityWidgetConfigurationBinding(@NonNull LinearLayout rootView,
      @NonNull CheckBox showThumbnails, @NonNull CheckBox showTimestamps,
      @NonNull RadioButton widgetConfigCategories, @NonNull Button widgetConfigConfirm,
      @NonNull RadioButton widgetConfigNotes, @NonNull RadioGroup widgetConfigRadiogroup,
      @NonNull Spinner widgetConfigSpinner) {
    this.rootView = rootView;
    this.showThumbnails = showThumbnails;
    this.showTimestamps = showTimestamps;
    this.widgetConfigCategories = widgetConfigCategories;
    this.widgetConfigConfirm = widgetConfigConfirm;
    this.widgetConfigNotes = widgetConfigNotes;
    this.widgetConfigRadiogroup = widgetConfigRadiogroup;
    this.widgetConfigSpinner = widgetConfigSpinner;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWidgetConfigurationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWidgetConfigurationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_widget_configuration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWidgetConfigurationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.show_thumbnails;
      CheckBox showThumbnails = rootView.findViewById(id);
      if (showThumbnails == null) {
        break missingId;
      }

      id = R.id.show_timestamps;
      CheckBox showTimestamps = rootView.findViewById(id);
      if (showTimestamps == null) {
        break missingId;
      }

      id = R.id.widget_config_categories;
      RadioButton widgetConfigCategories = rootView.findViewById(id);
      if (widgetConfigCategories == null) {
        break missingId;
      }

      id = R.id.widget_config_confirm;
      Button widgetConfigConfirm = rootView.findViewById(id);
      if (widgetConfigConfirm == null) {
        break missingId;
      }

      id = R.id.widget_config_notes;
      RadioButton widgetConfigNotes = rootView.findViewById(id);
      if (widgetConfigNotes == null) {
        break missingId;
      }

      id = R.id.widget_config_radiogroup;
      RadioGroup widgetConfigRadiogroup = rootView.findViewById(id);
      if (widgetConfigRadiogroup == null) {
        break missingId;
      }

      id = R.id.widget_config_spinner;
      Spinner widgetConfigSpinner = rootView.findViewById(id);
      if (widgetConfigSpinner == null) {
        break missingId;
      }

      return new ActivityWidgetConfigurationBinding((LinearLayout) rootView, showThumbnails,
          showTimestamps, widgetConfigCategories, widgetConfigConfirm, widgetConfigNotes,
          widgetConfigRadiogroup, widgetConfigSpinner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
