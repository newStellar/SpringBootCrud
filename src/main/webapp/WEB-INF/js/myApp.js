/**
 * Created by Nahid on 4/23/2016.
 */

//name first letter has to be Capital and rest of the name as camelcase style
var CommentBox = React.createClass({

    render: function() {
        return (
        <h2> Hello, world! I am a CommentBox.</h2>
        );
    }
});

ReactDOM.render(
<CommentBox />,  document.getElementById('content')
);
