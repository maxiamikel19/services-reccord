import axios from "axios";

const LOCAL_SERVICE_API_URI = 'http://localhost:8089/api/v1/services';

class LocalServiceService{

    getServices(){
        return axios.get(LOCAL_SERVICE_API_URI);
    }
}

export default new LocalServiceService();