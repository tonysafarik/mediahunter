import * as React from 'react';
import ButtonLink from '../fragment/ButtonLink';
import Logo from '../fragment/Logo';

interface Props {

}

class Login extends React.Component<Props> {
    constructor(props: Props) {
        super(props);
    }

    userName = React.createRef<HTMLInputElement>();
    password = React.createRef<HTMLInputElement>();

    render() {
        return (
            <div className="Login">
                <Logo/>
                <form>
                    <input className="Input" ref={this.userName} placeholder="USERNAME" type="text"></input>
                    <input className="Input" ref={this.password} placeholder="PASSWORD" type="password"></input>
                    <ButtonLink onClick={this.onLoginButtonClick} to="/">Login</ButtonLink>
                </form>
            </div>
        );
    }

    onLoginButtonClick() {

    }
}

export default Login;