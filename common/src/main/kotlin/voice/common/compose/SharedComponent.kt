package voice.common.compose

import com.squareup.anvil.annotations.ContributesTo
import voice.common.AppScope
import voice.common.pref.PrefKeys
import voice.pref.Pref
import javax.inject.Named

@ContributesTo(AppScope::class)
interface SharedComponent {

  @get:[
  Named(PrefKeys.DARK_THEME)
  ]
  val useDarkTheme: Pref<Boolean>
}
