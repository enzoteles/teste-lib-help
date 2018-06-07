package enzoteles.testelibhelp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.enzoteles.quickhelp.fragment.HelpManagerFragment
import br.com.enzoteles.quickhelp.security.HelpSecurity

class MainActivity : AppCompatActivity() {

    lateinit var home:HomeFragment
    lateinit var manager: HelpManagerFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        manager = HelpManagerFragment(this)
        HelpSecurity.manager = manager
        home = HomeFragment()
        manager!!.addFragment(R.id.content, home, "home", false)
    }
}
