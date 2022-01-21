// Generated by view binder compiler. Do not edit!
package it.feio.android.omninotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import it.feio.android.omninotes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPasswordBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText answer;

  @NonNull
  public final EditText answerCheck;

  @NonNull
  public final CroutonHandleBinding croutonHandle;

  @NonNull
  public final EditText password;

  @NonNull
  public final EditText passwordCheck;

  @NonNull
  public final ScrollView passwordRoot;

  @NonNull
  public final EditText question;

  private ActivityPasswordBinding(@NonNull RelativeLayout rootView, @NonNull EditText answer,
      @NonNull EditText answerCheck, @NonNull CroutonHandleBinding croutonHandle,
      @NonNull EditText password, @NonNull EditText passwordCheck, @NonNull ScrollView passwordRoot,
      @NonNull EditText question) {
    this.rootView = rootView;
    this.answer = answer;
    this.answerCheck = answerCheck;
    this.croutonHandle = croutonHandle;
    this.password = password;
    this.passwordCheck = passwordCheck;
    this.passwordRoot = passwordRoot;
    this.question = question;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.answer;
      EditText answer = rootView.findViewById(id);
      if (answer == null) {
        break missingId;
      }

      id = R.id.answer_check;
      EditText answerCheck = rootView.findViewById(id);
      if (answerCheck == null) {
        break missingId;
      }

      id = R.id.crouton_handle;
      View croutonHandle = rootView.findViewById(id);
      if (croutonHandle == null) {
        break missingId;
      }
      CroutonHandleBinding binding_croutonHandle = CroutonHandleBinding.bind(croutonHandle);

      id = R.id.password;
      EditText password = rootView.findViewById(id);
      if (password == null) {
        break missingId;
      }

      id = R.id.password_check;
      EditText passwordCheck = rootView.findViewById(id);
      if (passwordCheck == null) {
        break missingId;
      }

      id = R.id.password_root;
      ScrollView passwordRoot = rootView.findViewById(id);
      if (passwordRoot == null) {
        break missingId;
      }

      id = R.id.question;
      EditText question = rootView.findViewById(id);
      if (question == null) {
        break missingId;
      }

      return new ActivityPasswordBinding((RelativeLayout) rootView, answer, answerCheck,
          binding_croutonHandle, password, passwordCheck, passwordRoot, question);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}