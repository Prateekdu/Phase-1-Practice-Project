class MyHeader extends HTMLElement{
    connectedCallback(){
        this.innerHTML=`<header>
      <nav>
        <div class="navbar navbar-light bg-dark navbar-expand-sm ">
          <div class="container">
            <a class="navbar-brand" href="#"
              ><img src="img/logo.png" width="150px" height="40px" 
            /></a>
            <button
              class="navbar-toggler"
              data-bs-toggle="collapse"
              data-bs-target="#navbarNav1"
              type="button"
            >
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-end"
              id="navbarNav1">
              <ul class="navbar-nav">
                <li class="nav-item">
                  <a class="nav-link text-white" href="home.html">Home</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-white" href="menu.html">Menu</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-white" href="about.html">About</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-white" href="contact.html">Contact</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </nav>
    </header>`
    }
}
customElements.define("my-header",MyHeader)



class MyFooter extends HTMLElement{
    connectedCallback(){
        this.innerHTML=`<div class="footer">
        <pre class="h5">@Developed by Prateek Dubey</pre>
      </div>`
    }}
customElements.define("my-footer",MyFooter)