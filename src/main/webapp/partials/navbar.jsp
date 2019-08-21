<div class="uk-container-expand">
<nav class="uk-navbar-container" uk-navbar>

    <div class="uk-navbar-left">

        <ul class="uk-navbar-nav">
            <li id="thisButton" class="uk-active"><a href="#">This</a></li>
            <li>
                <a href="#">Is</a>
                <div class="uk-navbar-dropdown">
                    <ul class="uk-nav uk-navbar-dropdown-nav">
                        <li class="uk-active"><a href="#">Hope</a></li>
                        <li><a href="#">You</a></li>
                        <li><a href="#">Enjoy!</a></li>
                    </ul>
                </div>
            </li>
            <li id="button"><a href="#">My</a></li>
        </ul>

    </div>

    <div class="uk-navbar-right">

        <ul class="uk-navbar-nav">
            <li class="uk-active"><a href="#">Custom</a></li>
            <li>
                <a href="#">Nav</a>
                <div class="uk-navbar-dropdown">
                    <ul class="uk-nav uk-navbar-dropdown-nav">
                        <li class="uk-active"><a href="#">Hope</a></li>
                        <li><a href="#">You</a></li>
                        <li><a href="#">Enjoy!</a></li>
                    </ul>
                </div>
            </li>
            <li><a href="#">Bar</a></li>
        </ul>

    </div>
</nav>
</div>


<script>
    UIkit.util.on('#button', 'click', function () {
        console.log("Quit pressin' me!")
    });
</script>
<script>
    UIkit.util.on('#thisButton', 'click', function () {
        console.log("Feeling cheeky are we?")
    })
</script>
